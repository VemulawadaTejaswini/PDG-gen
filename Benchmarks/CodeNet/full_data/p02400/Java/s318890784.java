import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
//import java.io.*;
//class Main{
//    public static void main(String[] args) throws Exception{
//        int x, ans;
//     
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        x = Integer.parseInt(br.readLine());
//         
//        ans = x*x*x;
//        System.out.println(ans);
//    }
//}
//class Main {
//    public static void main(String[] arg)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        String[] div = str.split(" ");
//        int s =  Integer.parseInt(div[0]);
//        int l =  Integer.parseInt(div[1]);
//        System.out.println(s*l + " "+ 2*(s+l));
//    }   
//}
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//   
//public class Main{
//    public static void main(String args[])throws java.lang.Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line = br.readLine();
//        //?????°??????????????£??\
//        int s =Integer.parseInt(line);
//        int h = s / 3600;
//        int m = (s % 3600) / 60;
//        s = s % 60;
//        System.out.println(h+":"+m+":"+s);
//         
//    }
//}
//import java.io.*;
//
//public class Main
//{
//	public static void main(String[] args) throws Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		String[] div = str.split(" ");
//		int a = Integer.parseInt(div[0]);
//		int b = Integer.parseInt(div[1]);
//		if (a > b)
//		{
//			System.out.println("a > b");
//		} else if (a == b) {
//			System.out.println("a == b");
//		} else {
//			System.out.println("a < b");
//		}
//	}
//}
//public class Main
//{
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		String[] div = str.split(" ");
//		int a = Integer.parseInt(div[0]);
//		int b = Integer.parseInt(div[1]);
//		int c = Integer.parseInt(div[2]);
//		if (a < b && b < c)
//		{
//			System.out.println("Yes");
//		}else{
//			System.out.println("No");
//		}
//	}
//}
//public class Main {
//	public static void main(String[] args) {
//		for (int i = 0; i < 1000; i++) {
//			System.out.println("Hello World");
//		}
//	}
//}
//public class Main {
//    public static void main(String args[]) throws IOException{
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder builder = new StringBuilder();
//        int i=1;
//        while(true){
//            int data= Integer.parseInt(reader.readLine());
//            if(data==0)
//                break;
//             
//            builder.append("Case ").append(Integer.toString(i++)).append(": ").append(Integer.toString(data)).append("\n");
//        }
//        System.out.print(builder);
//    }
//}
//public class Main {
//    public static void main(String args[]) throws IOException{
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder builder = new StringBuilder();
//        while(true){
//            String data[] = reader.readLine().split(" ");
//            int a= Integer.parseInt(data[0]);
//            int b= Integer.parseInt(data[1]);
//            if(a==0 && b==0)
//                break;
//             
//            builder.append(Integer.toString(a<b?a:b)).append(" ").append(Integer.toString(a<b?b:a)).append("\n");
//        }
//        System.out.print(builder);
//    }
//}

//import java.io.*;

//class Main{
//    public static void main(String[] args) throws Exception{
//        int x, ans;
//     
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        x = Integer.parseInt(br.readLine());
//         
//        ans = x*x*x;
//        System.out.println(ans);
//    }
//}

//class Main {
//    public static void main(String[] arg)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        String[] div = str.split(" ");
//        int s =  Integer.parseInt(div[0]);
//        int l =  Integer.parseInt(div[1]);
//        System.out.println(s*l + " "+ 2*(s+l));
//    }   
//}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//   
//public class Main{
//    public static void main(String args[])throws java.lang.Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line = br.readLine();
//        //?????°??????????????£??\
//        int s =Integer.parseInt(line);
//        int h = s / 3600;
//        int m = (s % 3600) / 60;
//        s = s % 60;
//        System.out.println(h+":"+m+":"+s);
//         
//    }
//}

//import java.io.*;
//
//public class Main
//{
//	public static void main(String[] args) throws Exception
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		String[] div = str.split(" ");
//		int a = Integer.parseInt(div[0]);
//		int b = Integer.parseInt(div[1]);
//		if (a > b)
//		{
//			System.out.println("a > b");
//		} else if (a == b) {
//			System.out.println("a == b");
//		} else {
//			System.out.println("a < b");
//		}
//	}
//}

//public class Main
//{
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		String[] div = str.split(" ");
//		int a = Integer.parseInt(div[0]);
//		int b = Integer.parseInt(div[1]);
//		int c = Integer.parseInt(div[2]);
//		if (a < b && b < c)
//		{
//			System.out.println("Yes");
//		}else{
//			System.out.println("No");
//		}
//	}
//}

//public class Main {
//	public static void main(String[] args) {
//		for (int i = 0; i < 1000; i++) {
//			System.out.println("Hello World");
//		}
//	}
//}

//public class Main {
//    public static void main(String args[]) throws IOException{
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder builder = new StringBuilder();
//        int i=1;
//        while(true){
//            int data= Integer.parseInt(reader.readLine());
//            if(data==0)
//                break;
//             
//            builder.append("Case ").append(Integer.toString(i++)).append(": ").append(Integer.toString(data)).append("\n");
//        }
//        System.out.print(builder);
//    }
//}

//public class Main {
//	public static void main(String args[]) throws IOException {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(
//				System.in));
//		StringBuilder builder = new StringBuilder();
//		while (true) {
//			String data[] = reader.readLine().split(" ");
//			int a = Integer.parseInt(data[0]);
//			int b = Integer.parseInt(data[1]);
//			if (a == 0 && b == 0)
//				break;
//
//			builder.append(Integer.toString(a < b ? a : b)).append(" ")
//					.append(Integer.toString(a < b ? b : a)).append("\n");
//		}
//		System.out.print(builder);
//	}
//}

//public class Main {
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String line = br.readLine();
//		String[] ln = line.split(" ");
//		BigDecimal a = new BigDecimal(ln[0]);
//		BigDecimal b = new BigDecimal(ln[1]);
//		System.out.println(a.divideToIntegralValue(b).toPlainString() + " "
//				+ a.remainder(b).toPlainString() + " "
//				+ a.divide(b, 10, RoundingMode.HALF_UP).toPlainString());
//	}
//}

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
		System.out.printf("%6f %6f", a * a * Math.PI, a * 2 * Math.PI);
	}
}