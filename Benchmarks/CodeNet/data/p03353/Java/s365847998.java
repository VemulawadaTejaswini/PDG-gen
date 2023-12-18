import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String S = scan.next();
        int K = Integer.parseInt(scan.next());

        //文字列Sに含まれる全種類のアルファベットを辞書順で取得
        List<Character> clist = new ArrayList<>();
        for(int i = 0; i < S.length(); i++){
            clist.add(S.charAt(i));
        }
        Set<Character> cSet = new HashSet<>(clist);
        //System.out.println(cSet);


        Character[] cRegex = cSet.toArray(new Character[0]);
        Pattern p;
        Matcher m;
        Set<String> ansSet = new HashSet<>();
        for(int i = 0; i< cRegex.length; i++) {

            //System.out.println(cRegex[i]);
            p = Pattern.compile(cRegex[i].toString());
            m = p.matcher(S);

            List<String> subSlst = new ArrayList<>();
            while (m.find()) {

                //System.out.println(m.start());
                //System.out.println(S.substring(m.start()));
                subSlst.add(S.substring(m.start()));
            }
            //System.out.println(subSlst);

            int j = 1;
            int falseCount = 0;
            while(true){

                falseCount = 0;
                for(String sub : subSlst){
                    //System.out.println(sub);
                    if(j <= sub.length()){
                        //System.out.println(sub.substring(0, j));
                        ansSet.add(sub.substring(0, j));
                    }else{
                        falseCount++;
                    }
                    //System.out.println();
                }
                //System.out.println(ansSet);
                //System.out.println();

                if(falseCount == subSlst.size()){

                    String[] ansC = ansSet.toArray(new String[0]);
                    Arrays.sort(ansC);
                    System.out.println(ansC[K-1]);
                    return;
                }

                j++;
            }


        }


        return;
    }
}