import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        char[] colors = input.next().toCharArray();
        int sum =0;

        for (int i = 1; i <= colors.length - 2; i++) {
            for(int j=i+1; j<=colors.length-1; j++){
                for(int k=j+1; k<=colors.length;k++){
                    boolean first = (colors[i-1] != colors[j-1]) && (colors[i-1] != colors[k-1]) && (colors[j-1] != colors[k-1]);
                    boolean second = j-i != k-j;
                    if(first && second){

                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }




}
