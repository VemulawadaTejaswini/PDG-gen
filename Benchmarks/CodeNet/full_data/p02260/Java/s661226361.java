import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder build = new StringBuilder();
        int z = sc.nextInt();
        int[] ary = new int[z];
        for(int i = 0 ; i < ary.length; i++){
            ary[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < ary.length; i++){
            int min = i;
            for(int j = i; j < ary.length; j++){
                min = ary[min] > ary[j] ? j : min;
            }
            if(ary[i] != ary[min]){
                int temp = ary[i];
                ary[i] = ary[min];
                ary[min] = temp;
                count++;
            }
        }
        for(int i = 0; i < ary.length; i++){
            build.append(ary[i]);
            build.append(i==ary.length-1 ? "\n" : " ");
        }
        build.append(count);
        System.out.println(build.toString());
    }
}