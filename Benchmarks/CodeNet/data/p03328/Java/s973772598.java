import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    static int dp[];
    static ArrayList<Integer>arr;
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        ArrayList<Integer>al=new ArrayList<>();
        al.add(0,1);
        for (int i = 0; i <999; i++) {
            if(i!=0)
            al.add(al.get(i-1)+i+1);
        }
        Set<Integer>set=new HashSet<>();
        set.addAll(al);
        for(int i=0;i<499500;i++){
            if(set.contains(i+a) && set.contains(a+i)){
                System.out.println(i);
                break;
            }
        }
    }
}