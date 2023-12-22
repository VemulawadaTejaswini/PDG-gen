import java.util.*;
 
public class Main {
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        String text="";
        String target="";
        text=scan.nextLine();
        target=scan.nextLine();
        
        text=text+text;
        int index=text.indexOf(target);
        if(index!=-1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}