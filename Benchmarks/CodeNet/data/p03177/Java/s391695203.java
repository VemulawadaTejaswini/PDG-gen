import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */

import java.util.*;
import java.io.*;

class Mod{
    static final int MOD = 1000_000_007;
    static final long[] fact = makeFactorialArray(1000000);
    static final long[] factInv = makeInversedArray(fact);

    public static long add(long a, long b){
        long tmp = (a+b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long sub(long a, long b){
        return add(a,-b);
    }
    public static long mult(long a, long b){
        long tmp = (a*b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long power(long a, long x){ //calculate a^x
        if(x<0)return 0;
        if(x==0)return 1;
        if(x%2==0) {
            long half = power(a,x/2);
            return mult(half,half);
        }
        return (a*power(a,x-1)) % MOD;
    }
    public static long inverse(long a){
        return power(a,MOD-2);
    }
    public static long div(long a, long b){
        return mult(a, inverse(b));
    }
    public static long[] makeFactorialArray(int size){
        long[] array = new long[size];
        array[0]=1;
        for(int i=1;i<size;i++){
            array[i]=mult(array[i-1],i);
        }
        return array;
    }
    public static long[] makeInversedArray(long[] original){
        long[] array = new long[original.length];
        for(int i=0;i<original.length;i++){
            array[i] = inverse(original[i]);
        }
        return array;
    }
    public static long combination(int n, int r){
        if(n<0 || r<0 || n<r) return 0;
        return mult(fact[n], mult(factInv[r],factInv[n-r]));
    }
    public static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static long lcm(long a, long b){
        return (a/gcd(a,b))*b;
    }

}

class Matrix{
    int row, column;
    long[][] mat;//long[r][c]

    public Matrix(int r, int c){
        this.row = r;
        this.column = c;
        this.mat = new long[row][column];
    }
    public Matrix(long[][] mat){
        this.mat = mat;
        this.row = mat.length;
        this.column = mat[0].length;
    }

    int getRow(){
        return row;
    }
    int getColumn(){
        return column;
    }
    long get(int r, int c){
        return mat[r][c];
    }
    void set(int r, int c, long value){
        mat[r][c] = value;
    }
    Matrix copy(){
        Matrix ans = new Matrix(row, column);
        for(int r=0; r<row; r++) for(int c=0; c<column; c++) ans.set(r,c, mat[r][c]);
        return ans;
    }

    static long scalarPlus(long x, long y){
        return Mod.add(x,y);
    }
    static long scalarMinus(long x, long y){
        return Mod.sub(x,y);
    }
    static long scalarMult(long x, long y){
        return Mod.mult(x,y);
    }



    Matrix add(Matrix another){
        assert this.getRow()==another.getRow() && this.getColumn()==another.getColumn();
        Matrix ans = new Matrix(row, column);
        for(int r=0; r<row; r++) for(int c=0; c<column; c++){
            ans.set(r,c, scalarPlus(this.get(r,c), another.get(r,c)));
        }
        return ans;
    }
    Matrix sub(Matrix another){
        assert this.getRow()==another.getRow() && this.getColumn()==another.getColumn();
        Matrix ans = new Matrix(row, column);
        for(int r=0; r<row; r++) for(int c=0; c<column; c++){
            ans.set(r,c, scalarMinus(this.get(r,c), another.get(r,c)));
        }
        return ans;
    }

    static Matrix identity(int n){
        Matrix M = new Matrix(n,n);
        for(int i=0; i<n; i++) M.set(i,i,1);
        return M;
    }



    Matrix mult(int scalar){
        Matrix ans = new Matrix(row, column);
        for(int r=0; r<row; r++) for(int c=0; c<column; c++) ans.set(r,c, scalarMult(this.get(r,c), scalar));
        return ans;
    }
    Matrix mult(Matrix another){
        assert this.getColumn() == another.getRow();
        Matrix ans = new Matrix(this.getRow(), another.getColumn());
        for(int r=0; r<this.getRow(); r++) for(int c=0; c<another.getColumn(); c++){
            for(int k=0; k<this.getColumn(); k++){
                ans.set(r,c, scalarPlus(ans.get(r,c), scalarMult(this.get(r,k), another.get(k,c))));
            }
        }
        return ans;
    }

    Matrix power(long p){
        assert row==column;
        assert p>=0;
        if(p==0) return Matrix.identity(row);
        if(p==1) return this.copy();
        if(p%2==0){
            Matrix H = this.power(p/2);
            return H.mult(H);
        }else{
            Matrix M = this.power(p-1);
            return this.mult(M);
        }



    }

    long trace(){
        long tr = 0;
        assert row==column;
        for(int i=0; i<row; i++) tr += mat[i][i];
        return tr;
    }

    public String toString(){
        return Arrays.deepToString(mat);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = R;

        long K = sc.nextLong();
        Matrix M = new Matrix(R,C);
        for(int r=0; r<R; r++) for(int c=0; c<C; c++) M.set(r,c, sc.nextLong());

        Matrix P = M.power(K);

        long ans = 0;
        for(int r=0; r<R; r++) for(int c=0; c<C; c++) ans = Mod.add(ans, P.get(r,c));
        System.out.println(ans);
    }
}
