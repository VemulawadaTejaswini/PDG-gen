
import java.util.*;
public class aplle {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    ArrayList<Integer> red=new ArrayList<>();
    ArrayList<Integer> green=new ArrayList<>();
    ArrayList<Integer> nocolor=new ArrayList<>();
    ArrayList<Integer> newarr=new ArrayList<>();
    for(int i=0;i<a;i++){
        red.add(sc.nextInt());
    }
    for(int i=0;i<b;i++){
        green.add(sc.nextInt());
    }
    for(int i=0;i<c;i++){
        nocolor.add(sc.nextInt());
    }
    int s=0;
    Collections.sort(red,Collections.reverseOrder());
    Collections.sort(green,Collections.reverseOrder());
    Collections.sort(nocolor,Collections.reverseOrder());
    for(int i=0;i<x;i++){
    newarr.add(red.get(i));
        }
    for(int i=0;i<y;i++) {
        newarr.add(green.get(i));
    }
    for(int i=0;i<c;i++){
        newarr.add(nocolor.get(i));
    }
Collections.sort(newarr,Collections.reverseOrder());
    int f=x+y;
    for(int i=0;i<f;i++){
        s+=newarr.get(i);
    }

    System.out.println(s);
    //System.out.println(newarr);
}
}