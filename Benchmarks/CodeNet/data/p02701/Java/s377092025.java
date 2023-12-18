import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n,count = 0;
        List<String> s = new ArrayList<String>();
        List<String> s1 = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            s.add(sc.next());
            for(int j = 1; j < s.size(); j++){
                if(s.get(i).equals(s.get(j))){
                    if(s1.size() == 0){
                        count++;
                        s1.add(s.get(i));
                    }else{
                        //System.out.println(s1.size());
                        for(int k = 0; k < s1.size(); k++){
                            //System.out.println("comp "  + s1.get(k) + "  " + s.get(i));
                            if(s1.get(k).equals(s.get(i))){

                            }else{
                                count++;
                                s1.add(s.get(i));
                            }
                        }
                    }
                    
                }
            }
        }
        System.out.println(count);
    }
}