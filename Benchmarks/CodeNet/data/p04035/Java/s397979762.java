
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jiakang Chen
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int L = sc.nextInt();
        Rope[] S = new Rope[N];
        
        for (int i = 0; i < N; i++) {
            S[i] = new Rope(i + 1, sc.nextInt());
        }
        
        Arrays.sort(S);
        
        if (isValid(S, L)) {
            System.out.println("Possible");
            for (int i = 0; i < N - 1; i++) {
                System.out.println(S[i].i - 1);
            }
        } else {
            System.out.println("Impossible");
        }
    }
    
    public static boolean isValid(Rope[] S, int L) {
        return (S[S.length - 1].l + S[S.length - 2].l) >= L;
    }
}

class Rope implements Comparable<Rope> {
    public int i;
    public int l;
    
    public Rope(int index, int length) {
        i = index;
        l = length;
    }
    
    public int compareTo(Rope other) {
        return this.l - other.l;
    }
}