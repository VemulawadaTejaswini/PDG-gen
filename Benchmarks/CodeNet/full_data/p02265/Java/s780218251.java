import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int n=Integer.parseInt(scan.next());
    LinkedList<Long> link=new LinkedList<>();
    for(int i=0;i<n;i++){
      String input=scan.next();
      long num=Long.parseLong(scan.next());
      if(input.equals("insert")){
        link.addFirst(num);
      }else if(input.equals("delete")){
        link.remove(link.lastIndexOf(num));
      }else if(input.equals("deleteFirst")){
        link.remove(0);
      }else if(input.equals("deleteLast")){
        link.remove(link.size()-1);
      }
    }

    for(int i=0;i<link.size();i++){
      if(i<link.size()-1){
        System.out.print(link.get(i)+" ");
      }else {
        System.out.print(link.get(i));
      }
    }
  }
}
