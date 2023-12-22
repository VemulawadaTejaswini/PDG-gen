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
        boolean flag = true;
        int count = 0;
        while(flag){
            int j = 0;
            flag = false;
            for(int i = ary.length-1; i > j; i--){
                if(ary[i] < ary[i-1]){
                    int temp = ary[i];
                    ary[i] = ary[i-1];
                    ary[i-1] = temp;
                    count++;
                    flag = true;
                }
            }
            j++;
        }
        for(int i = 0; i < ary.length; i++){
            build.append(ary[i]);
            if(i == ary.length-1){
                build.append("\n");
            }else{ build.append(" ");
            }
        }
        build.append(count);
        System.out.println(build);
    }
}