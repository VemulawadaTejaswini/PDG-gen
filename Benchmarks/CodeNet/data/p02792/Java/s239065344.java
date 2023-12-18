import java.io.*;
import java.util.*;
import java.lang.*;

class Pair<E,F>{
    E first;
    F second;
    public Pair(E first, F second){
        this.first=first;
        this.second=second;
    }
    public E getFirst(){return first;}
    public F getSecond(){return second;}
    public String toString(){
        return "<"+first.toString()+","+second.toString()+">";
    }
    public int hashCode(){
        return first.hashCode()*30011+second.hashCode()+2;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair another = (Pair) obj;
        return this.getFirst().equals(another.getFirst())&&this.getSecond().equals(another.getSecond());
    }
}

public class Main {
    static int firstDigit(int n){
        return Integer.toString(n).charAt(0)-'0';
    }
    static int lastDigit(int n){
        return n%10;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] count = new int[10][10];
        for(int n=1; n<=N; n++) count[firstDigit(n)][lastDigit(n)]++;

        long ans = 0;
        for(int i=0; i<10; i++) for(int j=0; j<10; j++){
            ans += count[i][j]*count[j][i];
        }
        System.out.println(ans);
    }


}
