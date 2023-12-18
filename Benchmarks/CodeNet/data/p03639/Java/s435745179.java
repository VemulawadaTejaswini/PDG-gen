import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner re=new Scanner(System.in);
        int a=0,b=0,c=0;
        int x;
        int num=re.nextInt();
        for (int i=0;i<num;i++){
            x=re.nextInt();
            if (x%4==0){
                c++;
            }
            else if(x%2==0){
                b++;
            }
            else
                a++;
        }
        if (c>=b&&c!=0){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }

}
