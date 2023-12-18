import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Main{
    public static long Factorial (long i) {
        if(i ==0){
            return 0;
        }
        int fact = 1;
        for(int p = 2; p <= i; p++)
            fact = p+fact;
        return fact;
    }

    public static boolean isHalfAlphanumeric(String str) {
		return Pattern.matches("^[a-z]+$", str);
    }
    
    public static String splitstr(String str){
        String[] tmp = str.split("");
        List<String> array = new ArrayList<String>();
        for(String s : tmp){
            array.add(s);
        }
        Collections.sort(array);
        String tmp_str="";
        for(int k = 0; k < array.size(); k++){
            tmp_str = tmp_str + array.get(k);
        }
        return tmp_str;
    }

	public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
		int N = 0;
        List<String> anagram = new ArrayList<String>() ;
        

        try{
            int i = 0;
            while(sn.hasNext()){
                i++;
                String str = sn.nextLine();
                if(i==1){
                    N = Integer.valueOf(str);
                }else{
                    if(str.length() != 10 || !isHalfAlphanumeric(str)){
                        return;
                    }
                    anagram.add(str);
                }
                if(i == N+1){
                    break;
                }
            }
            if(anagram.size()!=N){
                //System.out.println("error");
                return;
            }
            sn.close();
            

            List<String> listB = anagram.stream().distinct().collect(Collectors.toList());
            if(listB.size() != N){
                return;
            }
            
            //anagram check
            List<String> listC = new ArrayList<String>();
            for(int j = 0; j < listB.size();j++){
                String tmp = listB.get(j);
                listC.add(splitstr(tmp));
            }
            Map<String,Long> map = listC.stream().collect(
                Collectors.groupingBy(x -> x, Collectors.counting())
            );

            long x = 0;
            List<String> listD = listC.stream().distinct().collect(Collectors.toList());
            for(String o : listD){
                long result = Factorial(map.get(o)-1);
                x = x + result;
            }
        System.out.println(x);
        }catch(Exception e){
            //do nothing
            return;
        }
    }
}