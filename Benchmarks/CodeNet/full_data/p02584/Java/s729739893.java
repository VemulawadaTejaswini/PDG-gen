import java.awt.*;
import java.io.*;
import java.net.StandardSocketOptions;
import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        new TestC().doIt();
    }
    class TestC{
        void doIt() {
            long X = sc.nextLong();
            long K = sc.nextLong();
            long D = sc.nextLong();
            X = Math.abs(X);
            long Straight = Math.min(K, X/D);
            K -= Straight;
            X -= Straight * D;

            if(K % 2 == 0){
                System.out.println(X);
            }else{
                System.out.println(D - X);
            }
        }
    }
}