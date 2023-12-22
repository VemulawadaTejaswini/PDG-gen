import		java.io.*;
public class Q10001 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		try{
			i = Integer.valueOf(br.readLine());
		}catch(Exception e){
			System.out.println("ツづュツつィツ、ツエツδ可ーツつセツづヲツハツニツーツ。");
		}
		i = i * i * i;
		System.out.println(i);
	}
}