package main

import (
	"fmt"
)

func main() {
	mainA()

}

func mainA() {
	var numH, numW, h, w int
	fmt.Scan(&numH, &numW, &h, &w)
	var res = solveA(numH, numW, h, w)
	fmt.Print(res)
}

func solveA(numH int, numW int, h int, w int) int {

	var res = 0
	res = (numH - h) * (numW - w)
	return res
}
