import java.util.Scanner;
public class B {
    int A=0,W=0,T=0,R=0;
    void main(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 0;i < N;i++){
            String txt = scan.next;
            if(txt == "AC"){
                A++;
            }else if(txt == "WA"){
                W++;
            }else if(txt == "TLE"){
                T++;
            }else if(txt == "RE"){
                R++;
            }
        }
        System.out.println("AC x " + A);
        System.out,println("WA x " + W);
        System.out.println("TLE x " + T);
        System.out.println("RE x " + R);
    }
    
}