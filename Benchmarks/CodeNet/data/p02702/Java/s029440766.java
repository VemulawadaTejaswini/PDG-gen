import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        long size = s.length();
        int count = 0;
        for(int i = 0; i<size + 1; i++){
            for(int j =i+5; j<size + 1; j++){
                String str = s.substring(i,j);
                if(str.equals(""))
                    continue;
                if(Integer.parseInt(String.valueOf(str.charAt(str.length() -1))) % 2 == 0){
                    continue;
                }
                if(isMultiple(str, 10,2019)){
                    count++;
                }
            }
        }
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
