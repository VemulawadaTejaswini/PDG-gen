import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        while(sc.hasNext()){
            run();
        }
    }
    static void run(){
        String[] A=sc.nextLine().split(" ");
        String[] B=sc.nextLine().split(" ");
        int Hit=0;
        int Blow=0;
        for(int i=0;i<4;i++){
            if(A[i].equals(B[i])){
                Hit++;
            }
            if(Arrays.asList(A).contains(B[i])){
                Blow++;
            }
        }
        Blow-=Hit;
        System.out.println(Hit+" "+Blow);
        
    }
}