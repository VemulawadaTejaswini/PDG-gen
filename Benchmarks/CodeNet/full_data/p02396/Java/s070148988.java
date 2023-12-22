import java.io.*;
class PrintTestCases{
	public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
StringBuilder str = new StringBuilder();
        int i = 1;
        while (true) {
            int data = Integer.parseInt(br.readLine());
            if (data == 0)
                break;
            str.append("Case ").append(Integer.toString(i)).append(": ")
                .append(Integer.toString(data)).append("\n");
            i++;
        }
        System.out.print(str);
    }
}