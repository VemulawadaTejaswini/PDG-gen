import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] S = str.toCharArray();
        boolean flag = true;
        for(int i=0; i<3; i++){
            if(S[i] == S[i+1]){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("good");
        }else{
            System.out.println("bad");
        }
    }
}