import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] n = scanner.nextLine().split(" ");
        int[] num=new int[n.length];
        for(int i=0;i<n.length;i++)
            num[i]=Integer.parseInt(n[i]);
        sort(num);
    }
    public static void sort(int[] num){
        Arrays.sort(num);
        StringBuilder output=new StringBuilder();
        for(int i=0;i<num.length;i++){
            System.out.printf(num[i]+" ");
        }
        System.out.println(output.toString().trim());
    }
}