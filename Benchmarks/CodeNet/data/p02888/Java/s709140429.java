import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str  = sc.nextLine();
        String[] astr = str.split(" "); //状況に合わせて
        int[] in_data = Stream.of(astr).mapToInt(x->{
            try{
                return Integer.parseInt(x);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return 0;
        }).toArray();
        sc.close();
        List<Integer> data = new ArrayList<Integer>(in_data.length);
        for (int i = 0; i < in_data.length; i++) {
            data.add(in_data[i]);
        }
        data.sort(Comparator.naturalOrder());

        int ans =0;
        Boolean flag = false;

        for(int i =0;i< data.size() ;i++){
            for(int j = i+1;j<data.size();j++){
                    if(i > 2*j){
                        break;
                    }
                for(int k =j+1;k<data.size();k++){
                    flag = check(data.get(i),data.get(j),data.get(k));
                    if(flag == true){
                        ans +=1;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static Boolean check(Integer a, Integer b, Integer c){
        if(a < b + c && b < a + c &&  c < a + b){
            return  true;
        }
        else{
            return  false;
        }
    }

}