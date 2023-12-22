import java.util.*;

class Main{

    int n, mod, a, b, c, t;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt(); mod = sc.nextInt();
            a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
            t = sc.nextInt();
            if(n==0 && mod==0 && a==0 && b==0 && c==0 && t==0) break;

            long[][] s = new long[n][1];
            for(int i=0; i<n; i++) s[i][0] = sc.nextLong();

            long[][] mat = new long[n][n];
            for(int i=0; i<n; i++){
                for(int j=-1; j<2; j++){
                    int idx = i + j;
                    if(idx<0 || idx>=n) continue;
                    if(j==-1) mat[i][idx] = a;
                    if(j==0) mat[i][idx] = b;
                    if(j==1) mat[i][idx] = c;
                }
            }

            mat = pow(mat, t);
            s = matmul(mat, s);
            for(int i=0; i<s.length-1; i++){
                System.out.print(s[i][0]+" ");
            }
            System.out.println(s[s.length-1][0]);
        }
    }

    //ティツ。ツ古・ツ按療」ツ?ョテヲツ篠崚」ツ?妥ァツョツ療」ツつ津」ツ?凖」ツつ?
    long[][] matmul(long[][] m1, long[][] m2){
        int a = m1.length, b = m2[0].length;
        long[][] res = new long[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                long sum = 0;
                for(int k=0; k<m1[0].length; k++){
                    sum += (m1[i][k] * m2[k][j]) % mod;
                }
                res[i][j] = sum % mod;
            }
        }
        return res;
    }

    //ティツ。ツ古・ツ按療」ツ?ョテァツエツッテ、ツケツ療」ツつ津ィツィツ暗ァツョツ療」ツ?凖」ツつ?
    long[][] pow(long[][] matrix, int l){
        long[][] ret = new long[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++) ret[i][i] = 1;
        /*
          lテ」ツつ?テゥツ?イテヲツ閉ーテ」ツ?ァティツ。ツィテ」ツ?凖」ツ??
          テ」ツδ禿」ツδε」ツδ暗」ツ?ョ1テ」ツ?古ァツォツ凝」ツ?」テ」ツ?ヲテ」ツ??」ツつ凝」ツ?ィテ」ツ?禿」ツつ催」ツ??」ツ?妥ヲツ篠崚」ツ?妥」ツつ凝」ツ??
         テッツシツ暗、ツセツ凝ッツシツ瑛=19テ」ツ?ョテ」ツ?ィテ」ツ??
          l = 10011
          A^19 = A^1 * A^2 * A^16
        */
        for(; l>0; l>>=1){
            if((l&1)>0) ret = matmul(ret, matrix);
            matrix = matmul(matrix, matrix);
        }
        return ret;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}