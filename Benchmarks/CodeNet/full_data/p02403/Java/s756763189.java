import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        StringBuilder allBuilder = new StringBuilder();
        int MAX=300;
        
        while(true){
            String[] area=reader.readLine().split(" ");
            int h=Integer.parseInt(area[0]);
            int w=Integer.parseInt(area[1]);
            
            if(h==0&&w==0) break;
            
            if(h<=MAX&&w<=MAX){
                for(int i=0;i<h;i++){
                    for(int j=0;i<w;j++) builder=builder.append("#");
                    builder=builder.append("\n");
                }
                allBuilder=allBuilder.append(builder+"\n");
                builder.delete(0, builder.length());
            }
            System.out.println(allBuilder);
        }
    }
}