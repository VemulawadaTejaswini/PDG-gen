import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int i,j;
        for (i=1;i<10;i++){
            for(j=1;j<10;j++){
                System.out.println(String.format("%dx%d=%d",i,j,i*j));
            }
        }
}
}
