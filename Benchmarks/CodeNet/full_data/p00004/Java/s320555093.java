import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString;

        while((inputString = br.readLine()) != null) {
            // inputs.length = 6ツづ債陛崢湘伉つウツづェツづつ「ツづゥ
            double[] inputs = stringsToDoubles(inputString.split(" "));
            // ツ係ツ青板行ツ療ア
            double[][] matrix = { {inputs[0], inputs[1]},
                               {inputs[3], inputs[4]} };
            // ツ陛サツ津カツ篠ョツ右ツ陛督づ個ベツクツトツδ仰表ツ記
            double[] vector = {inputs[2], inputs[5]};
            // ツ係ツ青板行ツ療アツづ個行ツ療アツ篠ョ
            double det = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
            // ツ係ツ青板行ツ療アツづ個逆ツ行ツ療ア
            double[][] inverse = { {matrix[1][1] / det, -1 * matrix[0][1] / det},
                                   {-1 * matrix[1][0] / det, matrix[0][0] / det} };
            // ツ嘉ー
            double[] solution = {inverse[0][0] * vector[0] + inverse[0][1] * vector[1],
                                 inverse[1][0] * vector[0] + inverse[1][1] * vector[1]};

//            System.out.printf("%.4g %.4g\n", solution[0], solution[1]);
        }
    }

    private static double[] stringsToDoubles(String[] s) {
        double[] results = new double[s.length];

        for(int i = 0; i < s.length; i++)
            results[i] = Double.parseDouble(s[i]);

        return results;
    }

}