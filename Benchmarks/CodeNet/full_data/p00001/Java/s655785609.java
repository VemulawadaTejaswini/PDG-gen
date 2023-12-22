import java.util.Arrays;

class Main{
    public static void main(String[] a){
		int[] d = new int[10];
		String[] s = a[0].split("\n",10);
		for(byte i=0;i<10;i++){
			d[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(d);
		System.out.println(d[9]+"\n"+d[8]+"\n"+d[7]);
    }
}