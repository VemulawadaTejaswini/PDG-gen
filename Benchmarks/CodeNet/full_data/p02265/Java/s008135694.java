import java.util.LinkedList;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        LinkedList<String> lnk=new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
             
            if(s.equals("deleteFirst"))lnk.remove();
            else if(s.equals("deleteLast"))lnk.removeLast();
            else  {String a=sc.next();
                if(s.equals("insert"))lnk.addFirst(a);
            else if(s.equals("delete")) lnk.remove(a);}
             
        }for(String i:lnk)System.out.print(i+" ");
    }
}