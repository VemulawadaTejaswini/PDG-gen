import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ar=s.toCharArray();
        boolean result=true;
        for(int i=0;i<ar.length;i++){
            if(i%2==0){
                if(ar[i]!='R' && ar[i]!='U' && ar[i]!='D'){
                    result=false;
                    break;
                }
            }
            else{
                if(ar[i]!='L' && ar[i]!='U' && ar[i]!='D'){
                    result=false;
                    break;
                }
            }
        }
        if(result==true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
