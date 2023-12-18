import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Problem Statement
// There are 
// N
//  people living on a number line.

// The 
// i
// -th person lives at coordinate 
// X
// i
// .

// You are going to hold a meeting that all 
// N
//  people have to attend.

// The meeting can be held at any integer coordinate. If you choose to hold the meeting at coordinate 
// P
// , the 
// i
// -th person will spend 
// (
// X
// i
// −
// P
// )
// 2
//  points of stamina to attend the meeting.

// Find the minimum total points of stamina the 
// N
//  people have to spend.

class Main {

    public static void main(final String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfPeople;
		try {
			numberOfPeople = Integer.parseInt(br.readLine());
		
        Long numberOfCoordinates[] = new Long[numberOfPeople];
        
        String string[] = br.readLine().split(" ");
        for (int i = 0; i < numberOfPeople; i++){
            numberOfCoordinates[i] = Long.parseLong(string[i]);
        }

        long output = Long.MAX_VALUE;

        for(int i = 0; i <= 100; i++){
            long cost = 0;
            for (int j = 0; j < numberOfPeople; j++){
                cost += Math.pow(numberOfCoordinates[j]-i,2);
            }
            output = Math.min(output,cost);
        }

        System.out.println(output);

    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }

}