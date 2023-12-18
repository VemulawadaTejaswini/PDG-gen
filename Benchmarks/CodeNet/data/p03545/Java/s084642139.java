
import java.util.*;
import java.util.stream.Collectors;



public class Main {
    public static int[] ints;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] strings=scanner.next().split("");
        ints=new int[strings.length];
        for(int i=0;i<ints.length;i++){
            ints[i]=Integer.parseInt(strings[i]);
        }
        char[] chars=new char[ints.length-1];
        func(3,chars,7);

    }
    public static void func(int index,char[] chars,int val){
        if(index==0){
            if(val==ints[0]){
                for(int i=0;i<ints.length-1;i++){
                    System.out.print(String.format("%d%c",ints[i],chars[i]));
                }
                System.out.println(String.format("%d=7",ints[ints.length-1]));
                System.exit(0);
            }else{
                return;
            }
        }
        char[] chars1=Arrays.copyOf(chars,chars.length);
        char[] chars2=Arrays.copyOf(chars,chars.length);
        chars1[index-1]='+';
        chars2[index-1]='-';
        func(index-1,chars1,val-ints[index]);
        func(index-1,chars1,val+ints[index]);


    }
}