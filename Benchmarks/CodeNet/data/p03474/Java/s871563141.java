import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Scanner ff=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        String S=ff.nextLine();
        if(S.contains("-")){
        String[] SS=S.split("-",0);
        if(SS[0].length()==A&&SS[1].length()==B){
            System.out.println("Yes");

        }else{
            System.out.println("No");
        }}
        else{
            System.out.println("No");
        }
       

        
        


    }
}
