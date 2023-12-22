import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        Set<String> set=new HashSet<String>();
        String str1;
        String str2;
        for(int i=0;i<n;i++){
            str1=scan.next();
            str2=scan.next();
            if(str1.equals("insert")) set.add(str2);
            else{
                if(set.contains(str2)) System.out.println("yes");
                else System.out.println("no");
            }
        }
    }
}
