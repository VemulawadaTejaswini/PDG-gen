import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

    	File file = new File("test.txt");
    	Scanner sc = new Scanner(file);
//        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        sc.close();
        int ans = 0;
        List<Integer> IList = new ArrayList<>();
//        List<String> list = new ArrayList<>();
        for(int i = 2019; i < 200001; i += 2019){
        	IList.add(i);
        }
//        System.out.println(IList.size());
//        for(int num : IList){
//        	System.out.println(num);
//        }
//        for(Integer num : IList){
//        	list.add(num.toString());
//        }
        List<Integer> NList = new ArrayList<>();
        int end = 4;
        int len = N.length();
        for(int i = 0; i < len-3; i++){
        	int tmp = Integer.parseInt(N.substring(i, i+end));
        	NList.add(tmp);
        	if(i+5 <= len){
        		tmp = Integer.parseInt(N.substring(i, i+5));
            	NList.add(tmp);
        	}
        	if(i+6 <= len){
        		tmp = Integer.parseInt(N.substring(i, i+6));
            	NList.add(tmp);
        	}
        }
        for(Integer num : NList){
        	for(Integer num2 : IList){
        		if(num.equals(num2)){
//        			System.out.println("N:"+ num + " I:"+ num2);
        			ans++;
        			continue;
        		}
        	}
        }
//        for(int num : NList){
//        	System.out.println(num);
//        }
        System.out.println(ans);
    }
}