import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        int i, m, f, r, gou, flg = 0, cnt = 0;
	String seiseki;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mid = new ArrayList<Integer>(); //??????????¨?????????°??¨
	ArrayList<Integer> fin = new ArrayList<Integer>(); //???????????????????????°??¨
	ArrayList<Integer> rit = new ArrayList<Integer>(); //???????¨?????????°??¨
	ArrayList<Character> sei = new ArrayList<Character>(); //????????¨

	//??\?????????
	for(i = 0; flg == 0; i++){
       	    m = sc.nextInt();
       	    mid.add(new Integer(m));
       	    f = sc.nextInt();
	    fin.add(new Integer(f));
       	    r = sc.nextInt();
       	    rit.add(new Integer(r));
	    cnt++;
	    if(m == -1 && f == -1 && r == -1)
		break;
        }
	//??????????????????
        for(i = 0; cnt != i; i++){
	    gou = fin.get(new Integer(i)) + mid.get(new Integer(i));
	    if(fin.get(new Integer(i)) == -1 || mid.get(new Integer(i)) == -1)
		sei.add('F');
	    else if(gou >= 80)
		sei.add('A');
	    else if(gou >= 65)
		sei.add('B');
	    else if(gou >= 50 || rit.get(new Integer(i)) >= 50)
		sei.add('C');
	    else if(gou >= 30)
		sei.add('D');
	    else
		sei.add('F');
	}
	for(i = 0; cnt - 1 != i; i++){
	    System.out.println(sei.get(new Integer(i)));
	}
    }
}