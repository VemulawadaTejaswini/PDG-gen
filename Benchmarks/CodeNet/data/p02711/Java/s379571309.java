import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dig=sc.nextInt();
        int temp;
        int flag=0;
        for(int i=0;i<3;i++){
            temp=dig%10;
            dig=dig/10;
            if(temp==7){
                flag=flag+1;
                break;
            }
            

        }
        if(flag==1)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
