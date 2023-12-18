import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> hey = new ArrayList<Integer>();
        for(int i=0;i<a-1;i++){
            int b = sc.nextInt();
            hey.add(b);
        }
        System.out.println(count(hey,hey.get(0))+" ");
        while(true){
            int g = count(hey,hey.get(0));
            int s=0;
            for(int h=0;h<g;h++){
                hey.remove(hey.get(0));
            }
            if(hey.size()==0){
                s=0;
            }
            else{
                s = count(hey,hey.get(0));
            }
                for(int f=0;f<g;f++){
                    if(f==0 ){
                        System.out.println(s);
                    }
                    else{
                        System.out.println(0);
                    }

                }
            if(hey.size()==0){
                break;
            }
        }

    }
    static int count(ArrayList<Integer> hey,int i){
        int sum=0;
        for(int a=0;a<hey.size();a++){
            if(i==hey.get(a)){
                sum+=1;
            }
        }
        return sum;
    }