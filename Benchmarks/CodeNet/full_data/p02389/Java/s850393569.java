import java.io.*;  

public class RectArea {
    public static void main(String[] args) throws IOException {
	int height;                                         // ?????°?????£?¨??????????
	int width;                                          // ?????°?????£?¨?????¨????
	int area;                                           // ?????°?????£?¨??????¢??????
    int l;
	/* ??\???????????? */
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/* ?????????????????\??? */
	//System.out.println("?????????????????\?????????????????????");
	height = Integer.parseInt(br.readLine());         

	/* ?¨???????????????\??? */
	//System.out.println("?¨???????????????\?????????????????????");
	width = Integer.parseInt(br.readLine());           

	/* ??¢???????±?????????¨??? */
	area = height * width;                              
	// System.out.println("??¢??????" + area); 
    l =  height + width+height + width;
    System.out.println(l+" "+ area );
    
    }
}