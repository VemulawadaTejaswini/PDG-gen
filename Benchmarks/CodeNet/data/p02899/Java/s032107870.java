import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int stu[] = new int[num];
        String[] a =new String[num + 1];
        int[] human = new int[num + 1];
        int[] member = new int[num + 1];
        Scanner sc = new Scanner(System.in);
        int co = 0;
        for(int i = 0;i<num;i++){
            a[co] = sc.next();
            co++;
        }
        for(int j = 0; j<num;j++){
            human[j] = Integer.parseInt(a[j]);
        }

        for(int k = 0;k<num;k++){
            member[human[k]] = k+1;
        }
        for(int l = 0;l<num;l++){
            System.out.print(member[l + 1]+(" "));
        }
    }
}