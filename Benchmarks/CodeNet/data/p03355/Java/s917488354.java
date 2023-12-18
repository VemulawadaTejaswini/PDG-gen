import java.util.ArrayList;
import java.util.*;

class Main{
        public static void main(String[] args){

                ArrayList<String> array = new ArrayList<String>();
                ArrayList<String> arraySub;
                Scanner scan = new Scanner(System.in);

                //scan
                String substring = scan.nextLine();
                int outNum = scan.nextInt() - 1;

                for(int i = 0; i < substring.length(); i++){
                        String subText = substring.substring(i);

                        for(int j = 0; j < subText.length(); j++){
                                array.add(subText.substring(0, j+1));
                                array = new ArrayList<String>(new HashSet<>(array));
                        }
                }

                //hashset
                arraySub = new ArrayList<String>(new HashSet<>(array));

                //sort
                Collections.sort(arraySub);

                //output
                System.out.println(arraySub.get(outNum));

        }
}
