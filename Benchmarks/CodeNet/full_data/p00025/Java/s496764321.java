import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 入力を読むのに必要
            String line; 
            String lineA[] = null;
            String lineB[] = null;;
            
            int i = 0;
            while ((line = br.readLine()) != null) {
            	if (i % 2 == 0) {
            		lineA = line.split(" ");
            	} else {
            		lineB = line.split(" ");
            		String result = compareLines(lineA, lineB);
            		System.out.println(result);
            	}
            	i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	private static String compareLines(String[] lineA, String[] lineB) {
		int hit = 0;
		int blow = 0;
		
		for (int j = 0; j < 4; j++) {
			if(lineA[j].equals(lineB[j])){
				hit++;
			}
		}
		
		for (String intA : lineA) {
			for (String intB : lineB) {
				if(intA.equals(intB)) {
					blow++;
				}
			}
		}
		
		blow -= hit;
		return hit + " " + blow;		
	}

}
