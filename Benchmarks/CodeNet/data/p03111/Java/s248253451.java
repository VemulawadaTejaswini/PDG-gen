import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List = new ArrayList<>();
        for(int a=0;a<3;a++)List1.add(sc.nextInt());
        int opt = 0;
        for(int a=0;a<N;a++){
            int num = sc.nextInt();
            if(List1.contains(num)==true) List1.remove(List1.indexOf(num));
            else List.add(num);
        }
        Collections.sort(List1,Comparator.reverseOrder());
        for(int a=0;a<List1.size();a++){
            int min = List1.get(a);
            int x =0;
            for(int b=0;b<List.size();b++){
                int num = Math.abs(List1.get(a)-List.get(b));
                if(num<min){
                    min =num;
                    x = b;
                }
            }
            if(List.size()>0)List.remove(x);
            if(min<=10) opt+=min;
            else{
                while(min>=10&&List.size()>0){
                    int min_num = min;
                    x = 100000;
                    for(int b=0;b<List.size();b++){
                        int num = Math.abs(min-List.get(b));
                        if(num<min_num){
                            min_num=num;
                            x = b;
                        }
                    }
                    if(x==100000) break;
                    opt+=10;
                    List.remove(x);
                    min = min_num;
                }
                opt+=min;
            }
        }
        System.out.println(opt);

    }
}
