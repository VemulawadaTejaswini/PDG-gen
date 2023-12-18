public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int BN = 0;
        char[] cArray = S.toCharArray();
        int ci = 0;
	ArrayList<Integer> a = new ArrayList<Integer>();

	for(int i = 0; i<cArray.length;i++) {
            if(cArray[i]=='B') {
                BN++;
		a.add(i);
            }
        }
        int fb, goalIndex;
        int cnt = 0;
        String sub = S.substring(0);
	int bn = BN;
        int index = 0;
        while(index < BN) {
	    fb = a.get(index);
            goalIndex = N-(bn--)-fb;
	    cnt = cnt + goalIndex;
            index++;
        }
	System.out.println(cnt);
    }
}