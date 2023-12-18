import java.util.*;

public class Main{
    public static void main(String[] args){
        int cnt=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] array=str.split("");
        for(int i=0;i<3;i++){
            cnt+=Integer.parseInt(array[i]);
        }
        System.out.println(cnt);
    }
}