import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Set<String>colors=new HashSet<String>();
        for(int i=0;i<N;i++){
        colors.add(sc.next());}
        if(colors.size()==3){
            System.out.println("Three");
        }else{
            System.out.println("Four");
        }

        }
       
        
    }