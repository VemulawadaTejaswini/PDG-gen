import org.apache.lucene.search.spell.JaroWinklerDistance;
import org.apache.lucene.search.spell.LevensteinDistance;
import java.util.Scanner;

public class Main {

    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        System.out.println( getSimilarScoreByLevenshteinDistance(S, T)+S.length()-T.length() );

        


    }

    
    private static int getSimilarScoreByLevenshteinDistance(String s1, String s2){

        
        LevensteinDistance dis =  new LevensteinDistance();
        return (dis.getDistance(s1, s2)*S.length());
    }

    
}
