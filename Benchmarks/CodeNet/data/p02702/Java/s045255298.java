import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long size = s.length();
        long count = 0;
        Set<String> set = new HashSet<>();
        for(int i = 0; i<size + 1; i++){
            for(int j =i; j<size + 1; j++){
                if(Math.abs(i - j) <=4)
                    continue;
                String str = s.substring(i,j);
                if(str.equals("")){
                    continue;
                }
                set.add(str);
            }
        }
        count = set.stream().filter(x -> isMultiple(x,10,2019)).count();
        System.out.println(count);
    }
    public static boolean isMultiple (String s, int base, int m) {
	int temp = 0;
	for (int i=0; i<s.length(); i++) {
		temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
	}
	if (temp==0) {return true;}
	return false;
}
}
