import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Y = sc.nextInt();

        loop:for(int i=0; i<=N; i++){
            for(int j=0; j<=N-i; j++){
                for(int k=0; k<=N-i-j; k++){
                    if(10000*i+5000*j+1000*k>Y){
                        break;
                    }
                    else{
                        if(10000*i+5000*j+1000*k==Y && i+j+k==N){
                            System.out.println(i + " " + j + " " + k);
                            break loop;
                        }
                    }
                }
            }
            if(i==N){
                System.out.println(-1 + " " + -1 + " " + -1);
            }
        }
    } 
}