import java.util.Scanner;

public class Main {
    public static boolean flag1 = false;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int i1[] = new int[4];
        for (int k = 0;k < i1.length;++k){
            i1[k] = Integer.valueOf(String.valueOf(s.charAt(k)));
        }
        fuka(i1,1,i1[0],String.valueOf(i1[0]));
    }

    public static void fuka(int array[],int count,int in,String out){
        if(flag1){
            return;
        }
        if(count == 4){
            if(in == 7){
                System.out.println(out + "=7");
                flag1 = true;
            }
        }
        else {
            fuka(array, count + 1, in + array[count], out + "+" + array[count]);
            fuka(array, count + 1, in - array[count], out + "-" + array[count]);
        }
    }


}