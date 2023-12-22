import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        String p=scan.next();

        int sl=s.length();
        int pl=p.length();
        char S[] = new char[sl];
        char P[] = new char[pl];

        for(int i=0;i<sl;i++){
            S[i]=s.charAt(i);
        }
        for(int i=0;i<pl;i++){
            P[i]=p.charAt(i);
        }
        int i,count=0;
        boolean t=false;
        for(i=0;i<sl;i++){
            count=0;
            for(int j=0;j<pl;j++){
                if(S[(i+j)%sl]==P[j]){
                    count++;
                }
            }
            if(count==pl){
                break;
            }
        }
        if(count==pl){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

