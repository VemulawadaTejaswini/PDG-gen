import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputDataList = new ArrayList<String>();
        String input = null;

        try {
            while ((input = in.readLine()) != null) {
                inputDataList.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        fishing(inputDataList);
    }

    private static void fishing(List<String> inputDataList) {
        String[] inputDataArray = inputDataList.get(0).split(" ");
        int[] catchFish = new int[Integer.parseInt(inputDataArray[0])];
        int events = Integer.parseInt(inputDataArray[1]);
        int max = 1;

        for (int i = 1; i <= events; i++) {
            max = fishCount(inputDataList.get(i), catchFish, max);
            System.out.println(max + " " + catchFish[max - 1]);
        }
    }

    private static int fishCount(String event, int[] catchFish, int max) {
        String[] eventData = event.split(" ");
        int participant = Integer.parseInt(eventData[0]);
        int getFishNum = Integer.parseInt(eventData[1]);

        catchFish[participant - 1] = catchFish[participant - 1] + getFishNum;

        if (participant == max) {
            if (getFishNum < 0) {
                return topParticipant(catchFish);
            } else {
                return participant;
            }
        }

        if (catchFish[participant - 1] > catchFish[max - 1]
                || (catchFish[participant - 1] == catchFish[max - 1] && participant < max)) {
            return participant;
        } else {
            return max;
        }
    }

    private static int topParticipant(int[] catchFish) {
        int max = 0;

        for (int i = 1; i < catchFish.length; i++) {
            if (catchFish[i] > catchFish[max]) {
                max = i;
            }
        }

        return max + 1;
    }

}