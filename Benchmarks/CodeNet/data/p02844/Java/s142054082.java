import java.util.stream.*;
import java.util.Scanner;
class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder buf = new StringBuilder();
        int N = sc.nextInt();
        String S = sc.next();
        List<String> list = new ArrayList<>();
        for (int i=0; i<=N-3; i++) {
        		for (int j=i+1; j<=N-2; j++) {
        			for (int k=j+1; k<=N-1; k++) {
        				buf.append(S.charAt(i));
        				buf.append(S.charAt(j));
        				buf.append(S.charAt(k));
        				String s = buf.toString();
        				list.add(s);
        				buf.delete(0, buf.length());
        			}
        		}
        }
        List<String> listB = list.stream().distinct().collect(Collectors.toList());
        System.out.println(listB.size());
    }
} 