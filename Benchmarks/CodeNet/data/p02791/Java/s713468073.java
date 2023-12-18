import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(num);
        for(int i=0;i<num;i++){
            list.add(s.nextInt());
        }
        int count=num;
        // for(int i=0;i<num;i++){
        //     System.out.print(list.get(i)+" ");
        // }
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                if(list.get(i)>list.get(j)){
                    // System.out.println(list.get(i)+">"+list.get(j));
                    // System.out.println("count :"+count);
                    count--;
                    break;
                }
            }
        }
        // if(count<0){
        //     count = 1;
        // }
        System.out.println(count);
        s.close();
    }
}