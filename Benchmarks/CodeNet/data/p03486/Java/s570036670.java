import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

    public class practice2_4 {
    	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String[] n = sc.next().split("");
    	List<String> n_list = Arrays.asList(n);
    	String[] s = sc.next().split("");
    	List<String> s_list = Arrays.asList(s);

    	Collections.shuffle(n_list);
	    Collections.shuffle(s_list);

	    String[] nn = (String[]) n_list.toArray();
	    String[] ss = (String[]) s_list.toArray();

        String nn_last = String.join("", nn);
        String ss_last = String.join("", ss);

        System.out.println(nn_last.compareTo(ss_last) < 0 ? "Yes" : "No");


    	}
    }